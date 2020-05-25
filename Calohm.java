package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/Calculadora")

public class Calohm{

	@Path("tensao")
@GET
@Produces("text/plain")
public String tensao (@QueryParam("amperes") String amperes, @QueryParam("ohms") String ohms){
        double amperagem = Double.parseDouble(amperes);
        double resistencia = Double.parseDouble(ohms);
        double voltagem = amperagem*resistencia;
        return "Tensão: " + voltagem;
}

@Path("/Corrente")
@GET
@Produces("text/plain")
 public  String  corrente ( @QueryParam ("volts") String volts , @QueryParam ("ohms") String ohms ) {
	       double voltagem  =  Double. parseDouble (volts);
	       double resistencia  = Double.parseDouble (ohms);
	       double  amperagem  = voltagem/resistencia;
	       return  " Corrente: "  + amperagem;
  }

@Path("/Resistencia")
@GET
@Produces("text/plain")
 public String  resistencia ( @QueryParam ("volts") String volts, @QueryParam ("amperes") String amperes) {
	       double voltagem =  Double.parseDouble (volts);
	        double amperagem =  Double. parseDouble (amperes);
	        double resistencia = voltagem/amperagem;
	        return  " Resistência: "  + resistencia;
	    }

	
}
