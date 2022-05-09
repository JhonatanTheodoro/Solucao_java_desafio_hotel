import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

   public class DeuseLindo {
	public static void main (String args[]) throws ParseException {
		
		//Declaração de variáveis.
		Scanner tec = new Scanner (System.in);
		String tipo_do_cliente, data1, data2, data3;
		String resp = "";
		int lake, brid, rid, dl1, dl2, dl3, db1, db2, db3, dr1, dr2, dr3=0;
		boolean dia1 = false, dia2 = false, dia3 = false;
		
		//Ler valores.
		tipo_do_cliente = tec.next();
		
		//Formatando as datas.
		data1 = tec.next();
		if(data1.contains("Jan")) {
			data1 = data1.replaceAll("Jan", "");
			String charToAdd1="/01/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
		else if(data1.contains("Fev")) {
			data1 = data1.replaceAll("Fev", "");
			String charToAdd1="/02/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
		else if (data1.contains("Mar")) {
			data1 = data1.replaceAll("Mar", "");
			String charToAdd1="/03/";
			data1 = data1.substring(0, 2) + charToAdd1 + data1.substring(2);
		}
        else if (data1.contains("Apr")) {
        	data1 = data1.replaceAll("Apr", "");
			String charToAdd1="/01/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
        else if (data1.contains("May")) {
        	data1 = data1.replaceAll("May", "");
			String charToAdd1="/05/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
        else if (data1.contains("June")) {
        	data1 = data1.replaceAll("June", "");
			String charToAdd1="/06/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
        else if (data1.contains("July")) {
        	data1 = data1.replaceAll("July", "");
			String charToAdd1="/07/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
        else if (data1.contains("Aug")) {
        	data1 = data1.replaceAll("Aug", "");
			String charToAdd1="/08/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
        else if (data1.contains("Sept")) {
        	data1 = data1.replaceAll("Sept", "");
			String charToAdd1="/09/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
        else if (data1.contains("Oct.")) {
        	data1 = data1.replaceAll("Oct.", "");
			String charToAdd1="/10/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
        }
        else if (data1.contains("Nov")) {
        	data1 = data1.replaceAll("Nov.", "");
			String charToAdd1="/11/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
		}
        else if (data1.contains("Dec")) {
        	data1 = data1.replaceAll("Dec", "");
			String charToAdd1="/12/";
			data1 = data1.substring(0, 2) + charToAdd1 +data1.substring(2);
        }
		DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateAsString = data1;
		Date date = sourceFormat.parse(dateAsString);
		
		data2 = tec.next();
		if(data2.contains("Jan")) {
			data2 = data2.replaceAll("Jan", "");
			String charToAdd1="/01/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
		else if(data2.contains("Fev")) {
			data2 = data2.replaceAll("Fev", "");
			String charToAdd1="/02/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
		else if (data2.contains("Mar")) {
			data2 = data2.replaceAll("Mar", "");
			String charToAdd1="/03/";
			data2 = data2.substring(0, 2) + charToAdd1 + data2.substring(2);
		}
        else if (data2.contains("Apr")) {
        	data2 = data2.replaceAll("Apr", "");
			String charToAdd1="/01/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
        else if (data2.contains("May")) {
        	data2 = data2.replaceAll("May", "");
			String charToAdd1="/05/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
        else if (data2.contains("June")) {
        	data2 = data2.replaceAll("June", "");
			String charToAdd1="/06/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
        else if (data2.contains("July")) {
        	data2 = data2.replaceAll("July", "");
			String charToAdd1="/07/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
        else if (data2.contains("Aug")) {
        	data2 = data2.replaceAll("Aug", "");
			String charToAdd1="/08/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
        else if (data2.contains("Sept")) {
        	data2 = data2.replaceAll("Sept", "");
			String charToAdd1="/09/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
        else if (data2.contains("Oct.")) {
        	data2 = data2.replaceAll("Oct.", "");
			String charToAdd1="/10/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
        }
        else if (data2.contains("Nov")) {
        	data2 = data2.replaceAll("Nov.", "");
			String charToAdd1="/11/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
		}
        else if (data2.contains("Dec")) {
        	data2 = data2.replaceAll("Dec", "");
			String charToAdd1="/12/";
			data2 = data2.substring(0, 2) + charToAdd1 +data2.substring(2);
        }
		DateFormat sourceFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		String dateAsString2 = data2;
		Date date2 = sourceFormat.parse(dateAsString2);
		
		
		data3 = tec.next();
		if(data3.contains("Jan")) {
			data3 = data3.replaceAll("Jan", "");
			String charToAdd1="/01/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
		else if(data3.contains("Fev")) {
			data3 = data3.replaceAll("Fev", "");
			String charToAdd1="/02/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
		else if (data3.contains("Mar")) {
			data3 = data3.replaceAll("Mar", "");
			String charToAdd1="/03/";
			data3 = data3.substring(0, 2) + charToAdd1 + data3.substring(2);
		}
        else if (data3.contains("Apr")) {
        	data3 = data3.replaceAll("Apr", "");
			String charToAdd1="/01/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
        else if (data3.contains("May")) {
        	data3 = data3.replaceAll("May", "");
			String charToAdd1="/05/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
        else if (data3.contains("June")) {
        	data3 = data3.replaceAll("June", "");
			String charToAdd1="/06/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
        else if (data3.contains("July")) {
        	data3 = data3.replaceAll("July", "");
			String charToAdd1="/07/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
        else if (data3.contains("Aug")) {
        	data3 = data3.replaceAll("Aug", "");
			String charToAdd1="/08/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
        else if (data3.contains("Sept")) {
        	data3 = data3.replaceAll("Sept", "");
			String charToAdd1="/09/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
        else if (data3.contains("Oct.")) {
        	data3 = data3.replaceAll("Oct.", "");
			String charToAdd1="/10/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
        }
        else if (data3.contains("Nov")) {
        	data3 = data3.replaceAll("Nov.", "");
			String charToAdd1="/11/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
		}
        else if (data3.contains("Dec")) {
        	data3 = data3.replaceAll("Dec", "");
			String charToAdd1="/12/";
			data3 = data3.substring(0, 2) + charToAdd1 +data3.substring(2);
        }
		DateFormat sourceFormat3 = new SimpleDateFormat("dd/MM/yyyy");
		String dateAsString3 = data3;
		Date date3 = sourceFormat.parse(dateAsString3);

		//Convertendo a data para calender.
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		    case Calendar.SATURDAY:
		        cal.add(Calendar.DAY_OF_WEEK, 2); 
		        break;
		    case Calendar.SUNDAY:
		        cal.add(Calendar.DAY_OF_WEEK, 1);
		        break;
		    default:
		        break;
		}
		Date dataSemana = cal.getTime();

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		int day2 = cal2.get(Calendar.DAY_OF_WEEK);
		switch (day2) {
		    case Calendar.SATURDAY:
		        cal2.add(Calendar.DAY_OF_WEEK, 2);  
		        break;
		    case Calendar.SUNDAY:
		        cal2.add(Calendar.DAY_OF_WEEK, 1);
		        break;
		    default:
		        break;
		}
		Date dataSemana2 = cal2.getTime();
		
		Calendar cal3 = Calendar.getInstance();
		cal3.setTime(date3);
		int day3 = cal3.get(Calendar.DAY_OF_WEEK);
		switch (day3) {
		    case Calendar.SATURDAY:
		        cal3.add(Calendar.DAY_OF_WEEK, 2);  
		        break;
		    case Calendar.SUNDAY:
		        cal3.add(Calendar.DAY_OF_WEEK, 1);
		        break;
		    default:
		        break;
		}
		Date dataSemana3 = cal3.getTime();
			    
		//tranformando as datas em fim de semana ou não.
		//Precisa mudar isso aqui.
		if(dataSemana.equals("Mon") || dataSemana.equals("Tue") || dataSemana.equals("Wed") || dataSemana.equals("Thu") || dataSemana.equals("Fri")) {
			dia1 = true;
		}
		else if(dataSemana.equals("Sat") || dataSemana.equals("Sun")) {
			dia1 = false;
		}
		if(dataSemana2.equals("Mon") || dataSemana2.equals("Tue") || dataSemana2.equals("Wed") || dataSemana2.equals("Thu") || dataSemana2.equals("Fri")) {
			dia2 = true;
		}
		else if(dataSemana2.equals("Sat") || dataSemana2.equals("Sun")) {
			dia2 = false;
		}
		if(dataSemana3.equals("Mon") || dataSemana3.equals("Tue") || dataSemana3.equals("Wed") || dataSemana3.equals("Thu") || dataSemana3.equals("Fri")) {
			dia3 = true;
		}
		else if(dataSemana3.equals("Sat") || dataSemana3.equals("Sun")) {
			dia3 = false;
		}
		
		//Se o cliente for regular.
		if (tipo_do_cliente.equals("Regular")) {
			//se o dia for fim de semana ou dia de semana.
			if(dia1==true) {
				dl1 = 110;
				db1 = 160;
				dr1 = 220;
			}
			else{
				dl1 = 90;
				db1 = 60;
				dr1 = 150;
			}
			if(dia2==true) {
				dl2 = 110;
				db2 = 160;
				dr2 = 220;
			}
			else {
				dl2 = 90;
				db2 = 60;
				dr2 = 150;
			}
			if(dia3==true) {
				dl3 = 110;
				db3 = 160;
				dr3 = 220;
			}
			else {
				dl3 = 90;
				db3 = 60;
				dr3 = 150;
			}
			//atribuindo o valor na variavel
			lake = dl1+dl2+dl3;
		    brid = db1+db2+db3;
		    rid = dr1+dr2+dr3;
		    //retornar o menor caso teja um.
		    if(lake<brid && lake<rid) {
		    	resp = "lake";
		    }
		    else if(brid<lake && brid<rid) {
		    	resp = "brid";
		    }
		    else if(rid<lake && rid<brid) {
		    	resp = "rid";
		    }
		    //retornar o com mais estrelas caso nao tenha um menor.
		    else if(lake==brid && lake==rid) {
		    	resp = "rid";
		    }
		    else if(lake<brid && lake==rid) {
		    	resp = "rid";
		    }
		    else if(lake==brid && lake<rid) {
		    	resp = "brid";
		    }
		    else if(brid<lake && brid==rid) {
		    	resp = "rid";
		    }
		}
		
		//se o cliente for rewards.
		else if(tipo_do_cliente.equals("Rewards")) {
			if(dia1==true) {
				dl1 = 80;
				db1 = 110;
				dr1 = 100;
			}
			else{
				dl1 = 80;
				db1 = 50;
				dr1 = 40;
			}
			if(dia2==true) {
				dl2 = 80;
				db2 = 110;
				dr2 = 100;
			}
			else {
				dl2 = 80;
				db2 = 50;
				dr2 = 40;
			}
			if(dia3==true) {
				dl3 = 80;
				db3 = 110;
				dr3 = 100;
			}
			else {
				dl3 = 80;
				db3 = 50;
				dr3 = 40;
		   }
			//atribuindo o valor na variavel.
			lake = dl1+dl2+dl3;
		    brid = db1+db2+db3;
		    rid = dr1+dr2+dr3;
		    //coments: retornar o menor caso teja um.
		    if(lake<brid && lake<rid) {
		    	resp = "lake";
		    }
		    else if(brid<lake && brid<rid) {
		    	resp = "brid";
		    }
		    else if(rid<lake && rid<brid) {
		    	resp = "rid";
		    }
		    //retornar o com mais estrelas caso nao tenha um menor.
		    else if(lake==brid && lake==rid) {
		    	resp = "rid";
		    }
		    else if(lake<brid && lake==rid) {
		    	resp = "rid";
		    }
		    else if(lake==brid && lake<rid) {
		    	resp = "brid";
		    }
		    else if(brid<lake && brid==rid) {
		    	resp = "rid";
		    }    
	}
		
		//declarar o hotel mais barato.
		if(resp.equals("lake")) {
			System.out.println("Lakewood");
		}
		else if(resp.equals("brid")) {
			System.out.println("Bridwood");
		}
		else if(resp.equals("rid")) {
			System.out.println("Ridgewood");
		}
		    }
   }