package com.github.gtmelo.sistci_api.services.v1;

import com.github.gtmelo.sistci_api.controller.TciManager;
import com.github.gtmelo.sistci_api.json.JsonElement;
import com.github.gtmelo.sistci_api.json.JsonFactory;
import com.github.gtmelo.sistci_api.security.RequestValidator;
import io.swagger.annotations.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static com.github.gtmelo.sistci_api.main.Main.log;

@Path("/v1/tci")
@Api(value = "/tci", description = "Gerenciar TCIs")

public class TciResource {

    @GET
    @Path("/{tciId}")
    @Produces("application/json;charset=utf-8")
    @ApiOperation(value = "Obter TCI",
            notes = "Esta API recupera informaçoes sobre um TCI"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success: { tci data }"),
            @ApiResponse(code = 400, message = "Fail: { error data }")
    })
    public Response getTci(
            @ApiParam(value = "tciId", required = true, defaultValue = "1", allowableValues = "", allowMultiple = false)
            @PathParam("tciId") int tciId
    ) {

        ViewTci viewTci;


        try {

            viewTci = TciManager.getInstance().findTci(true, 0, 1, "tciid = " + tciId).get(0);

            return Response.status(Response.Status.OK).entity(viewTci).build();

        } catch (Exception e) {
            log.info(e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "tciId inválido"),
                                               new JsonElement("status", "FAIL")))
                    .build();
        }
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Obter todos os TCIs",
            notes = "Recupera informaçoes sobre todos os TCIs"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success: { tci data }"),
            @ApiResponse(code = 204, message = "Fail: { no data found }"),
            @ApiResponse(code = 400, message = "no content")
    })
    public Response getTci(
            @ApiParam(value = "offset", defaultValue = "", allowableValues = "", allowMultiple = false)
            @QueryParam("offset") int offset,
            @ApiParam(value = "limit", defaultValue = "", allowableValues = "", allowMultiple = false)
            @QueryParam("limit") int limit
    ) {

        try {

            List<ViewTci> tcis      = new ArrayList<>();
            String    apiToken  = "123456";
            ViewTciHolder tciHolder = new ViewTciHolder();

            if (RequestValidator.getInstance().validarRequest(apiToken)) {
                tcis = TciManager.getInstance().findTci(true, offset, limit);
                tciHolder.setViewTcis(tcis);
            }

            if (tcis.size() == 0) {
                log.debug(tcis.size());
                return Response.status(Response.Status.NO_CONTENT).build();
            }

            return Response.status(Response.Status.OK).entity(tciHolder).build();


        } catch (Exception e) {

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "tciId inválido"),
                                               new JsonElement("status", "FAIL")))
                    .build();

        }

    }

    @POST
    @Path("/")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Cria um TCI caso ele não exista")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Success: { TCI data }"),
            @ApiResponse(code = 400, message = "Fail: { TCI fail }")})
    public Response createTci(
            @ApiParam(value = "Objeto JSON com os dados do novo TCI", required = true, defaultValue = "\"{ \"name\" : \"Tom Jay\" } \"", allowableValues = "", allowMultiple = false)
                    Tci inputTci) {
        try {

            inputTci.setId(0);

            ViewTci result = TciManager.getInstance().insertTci(inputTci);

            return Response.status(Response.Status.CREATED).entity(result).build();

        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "Falha ao criar TCI"),
                                               new JsonElement("status", "FAIL")))
                    .build();
        }
    }

    @PUT
    @Path("/{tciId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Atualiza um TCI")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Success: { TCI data }"),
            @ApiResponse(code = 400, message = "Fail: { TCI fail }")})
    public Response updateTci(
            @PathParam("tciId") String tciId, Tci tci) {

        try {

            ViewTci viewTci = TciManager.getInstance().updateTci(tciId, tci);

            return Response.status(Response.Status.OK).entity(viewTci).build();

        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "Falha ao atualizar TCI"),
                                               new JsonElement("status", "FAIL")))
                    .build();
        }
    }

    @DELETE
    @Path("/{tciId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Delete TCI", notes = "Apaga o TCI")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success: {}"),
            @ApiResponse(code = 404, message = "Error: { Not found }")})
    public Response deleteTci(@PathParam("tciId") String tciId) {

        try {
            TciManager.getInstance().deleteTci(tciId);
            return Response.status(Response.Status.OK).entity("{}").build();
        } catch (Exception e) {

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "Falha ao apagar TCI"),
                                               new JsonElement("status", "FAIL")))
                    .build();

        }

    }


}
