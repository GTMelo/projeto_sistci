package com.github.gtmelo.sistci_api.services.v1;

import com.github.gtmelo.sistci_api.controller.TciManager;
import com.github.gtmelo.sistci_api.json.JsonElement;
import com.github.gtmelo.sistci_api.json.JsonFactory;
import com.github.gtmelo.sistci_api.security.exception.DataNotFoundException;
import io.swagger.annotations.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 02364114110 on 09/11/2016.
 */

@Path("/v1/tci")
@Api(value = "/tci", description = "Gerenciar TCIs")

public class TciResource {

    @GET
    @Path("/{tciId}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Obter TCI",
            notes = "Esta API recupera informaçoes sobre um TCI"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success: { tci data }"),
            @ApiResponse(code = 400, message = "Fail: { error data }")
    })
    public Response getTci(
            @ApiParam(value = "tciId", required = true, defaultValue = "123456", allowableValues = "", allowMultiple = false)
            @PathParam("tciId") String tciId
    ) {

        Tci tci;

        try {

            tci = TciManager.getInstance().findTci(tciId);
            return Response.status(Response.Status.OK).entity(tci).build();

        } catch (DataNotFoundException e) {

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "bad tciId"), new JsonElement("status", "FAIL")))
                    .build();

        }

    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Obter todos os TCIs",
            notes = "Esta API recupera informaçoes sobre todos os TCIs"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success: { tci data }"),
            @ApiResponse(code = 400, message = "Fail: { error data }")
    })
    public Response getTci() {
        try {

            int offset = 0;

            List<Tci> tcis = TciManager.getInstance().findTci(offset);
            TciHolder tciHolder = new TciHolder();
            tciHolder.setTcis(tcis);

            return Response.status(Response.Status.OK).entity(tciHolder).build();

        } catch (DataNotFoundException e) {

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "bad tciId"), new JsonElement("status", "FAIL")))
                    .build();

        } catch (SQLException e) {

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "no data found"), new JsonElement("status", "FAIL")))
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
                    String jsonString) {

        JSONObject jObject = null;

        try {
            Object obj = JSONValue.parse(jsonString);
            jObject = (JSONObject) obj;

        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "Falha ao criar TCI"), new JsonElement("status", "FAIL")))
                    .build();
        }

        try {

            Tci novoTci = TciFactory.build(jObject);

            return Response.status(Response.Status.OK).entity(novoTci).build();
        } catch (Exception e) {
        }

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(JsonFactory.output(new JsonElement("error", "Falha ao criar TCI"), new JsonElement("status", "FAIL")))
                .build();

    }

    @PUT
    @Path("/{tciId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Atualiza um TCI")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Success: { TCI data }"),
            @ApiResponse(code = 400, message = "Fail: { TCI fail }")})
    public Response updateTci(
            @PathParam("tciId") String tciId, String jsonString) {

        JSONObject jObject = null;

        try {
            Object obj = JSONValue.parse(jsonString);
            jObject = (JSONObject) obj;

        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "Falha ao atualizar TCI"), new JsonElement("status", "FAIL")))
                    .build();
        }

        try {


            Tci tciUpdated = TciManager.getInstance().updateTci(tciId, jObject);

            return Response.status(Response.Status.OK).entity(tciUpdated).build();
        } catch (Exception e) {
        }

        return Response.status(Response.Status.BAD_REQUEST)
                .entity(JsonFactory.output(new JsonElement("error", "Falha ao atualizar TCI"), new JsonElement("status", "FAIL")))
                .build();


    }

    @DELETE
    @Path("/{tciId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Delete TCI", notes = "Apaga o TCI")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success: { }"),
            @ApiResponse(code = 400, message = "Error: { Error Data }")})
    public Response deleteUser(@PathParam("tciId") String tciId) {

        try {
            TciManager.getInstance().deleteUser(tciId);

            return Response.status(Response.Status.OK).entity("{}").build();
        } catch (Exception e) {

            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "Falha ao apagar TCI"), new JsonElement("status", "FAIL")))
                    .build();

        }

    }



}
