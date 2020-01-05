/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utpl.sistemas.miproyectotarea;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author czambranoc
 */
@Path("/proyectoUrlTarea")
public class ProyectoUrlTareaResource {

    @Context
    private UriInfo context;
    public String tipnumero;
    public String json;

    /**
     * Creates a new instance of ProyectoUrlTareaResource
     */
    public ProyectoUrlTareaResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.utpl.sistemas.miproyectotarea.ProyectoUrlTareaResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson(@QueryParam("Número: ") String numero) {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        tipnumero = numero.substring(0, 2);
        String ZCTRN = "02";
        String ZCTRS = "03";
        String ZOESUR = "04";
        String ZOECTR = "05";
        String ZNOR = "06";
        String ZSUR = "07";

        if ((numero.length() < 7 && numero.length() > 0) || (numero.length() > 13)) {
            String mensaje = "NUMERO INVALIDO";
            return Response.status(200).entity(mensaje).build();

        } else if (tipnumero.equals("09") || tipnumero.equals("+5") || tipnumero.equals("59")) {
            json = "\n"
                    + "{\n"
                    + "\n'País': 'Ecuador',"
                    + "\n'Tipo - Móvil':  " + numero + "}";
            System.out.println(json);
            return Response.status(200).entity(json).build();

        } else {

            System.out.println("Tipo - Fijo " + numero);

            if (numero.length() < 8) {

                json = "\n"
                        + "{\n"
                        + "\n'País': 'Ecuador',"
                        + "\n'Tipo - Local':  " + numero + "}";

                System.out.println(json);

                return Response.status(200).entity(json).build();
            } else if (numero.length() == 9) {

                if (tipnumero.equals(ZCTRN)) {
                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Zona Centro Norte: Pichincha, Santo Domingo',"
                            + "\n'Tipo - Provincial':  " + numero + "}";

                    System.out.println(json);

                    return Response.status(200).entity(json).build();

                }
                if (tipnumero.equals(ZCTRS)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Zona Centro Sur: Cotopaxi, Tungurahua, Bolívar, Chimborazo',"
                            + "\n'Tipo - Provincial':  " + numero + "}";

                    System.out.println(json);

                    return Response.status(200).entity(json).build();

                }
                if (tipnumero.equals(ZOESUR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Zona Sur Oeste: Guayas, Santa Elena',"
                            + "\n'Tipo - Provincial':  " + numero + "}";

                    System.out.println(json);

                    return Response.status(200).entity(json).build();

                }
                if (tipnumero.equals(ZOECTR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Zona Sur Oeste Central: Manabí, Los Ríos',"
                            + "\n'Tipo - Provincial':  " + numero + "}";

                    System.out.println(json);

                    return Response.status(200).entity(json).build();

                }
                if (tipnumero.equals(ZSUR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Zona Sur: Azuay, Cañar, El Oro, Loja, Morona Santiago, Zamora Chinchipe',"
                            + "\n'Tipo - Provincial':  " + numero + "}";

                    System.out.println(json);

                    return Response.status(200).entity(json).build();
                }
                if (tipnumero.equals(ZNOR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Zona Norte: Carchi, Esmeraldas, Imbabura, Napo, Orellana, Sucumbios',"
                            + "\n'Tipo - Provincial':  " + numero + "}";

                    System.out.println(json);

                    return Response.status(200).entity(json).build();

                }
            }

        }

        return Response.status(200).entity(json).build();
    }

    /**
     * PUT method for updating or creating an instance of
     * ProyectoUrlTareaResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
