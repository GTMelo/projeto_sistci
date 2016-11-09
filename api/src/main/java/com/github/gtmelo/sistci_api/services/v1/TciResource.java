package com.github.gtmelo.sistci_api.services.v1;

import com.github.gtmelo.sistci_api.json.JsonElement;
import com.github.gtmelo.sistci_api.json.JsonFactory;
import com.github.gtmelo.sistci_api.json.JsonList;
import io.swagger.annotations.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by 02364114110 on 09/11/2016.
 */

@Path("/v1/tci")
@Api(value = "/tci", description = "Gerenciar TCIs")

public class TciResource {

    @GET
    @Path("/xx")
    @Produces(MediaType.TEXT_PLAIN)

    public String xx() {
        return "hello world!";
    }

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
    public Response getTciById(
            @ApiParam(value = "tciId", required = true, defaultValue = "123456", allowableValues = "", allowMultiple = false)
            @PathParam("tciId") String tciId
    ) {

        JsonList list = JsonList.build();
        String result = JsonFactory.output(list);

        // TODO apagar testValue quando tiver um controller pra prover a lógica de validação da request
        String testValue = "123456";
        if (!tciId.equals(testValue)) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(JsonFactory.output(new JsonElement("error", "bad tciId"), new JsonElement("status", "FAIL")))
                    .build();
        }

        Tci tci = TciFactory.build();

        return Response.status(Response.Status.OK).entity(tci).build();

    }


//    @POST
//
//    @PUT
//
//    @DELETE


}
