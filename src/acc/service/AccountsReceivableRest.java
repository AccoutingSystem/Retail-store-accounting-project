package acc.service;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import acc.dao.AccountsPayableDao;
import acc.dao.AccountsReceivableDao;
import acc.dao.ChartOfAccountsDao;
import acc.pojo.AccountsPayable;
import acc.pojo.AccountsReceivable;
import acc.pojo.ChartOfAccounts;

@Path("/AccountsReceivable")
public class AccountsReceivableRest {
	
	AccountsReceivableDao dao = null;

	@POST
	@Path("/Save")
	// @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.TEXT_HTML)
	public void addAccountsReceivables(AccountsReceivable receivable) {

		dao = new AccountsReceivableDao();
		long chartId = receivable.getC();
		dao.saveAccountsReceivables(receivable, chartId);

	}

	// for updating
	@PUT
	@Path("/Update")
	@Produces(MediaType.TEXT_HTML)
	public void update(AccountsReceivable receivable) {

		dao = new AccountsReceivableDao();
		dao.update(receivable);
	}

	// for deleting
	@DELETE
	@Path("{Folio_Number}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("Folio_Number") Long receivableId) {
		
		dao = new AccountsReceivableDao();
		dao.remove(receivableId);
	}

	// for retrieving
	@GET
	@Path("/Retrieve")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response findAll() throws Exception {
		
		JSONArray jsonArray = new JSONArray();
		String converter;

		dao = new AccountsReceivableDao();
		List<AccountsReceivable> results = dao.listAccountsReceivables();

		for (int i = 0; i < results.size(); i++) {
			
			JSONObject receivable = new JSONObject();
			receivable.put("folioNr", results.get(i).getFolioNr());
			receivable.put("amount", results.get(i).getAmount());
			receivable.put("receivablesDate", results.get(i)
					.getReceivablesDate());
			receivable
					.put("receivableType", results.get(i).getReceivableType());
			receivable.put("chartCode", results.get(i).getCharts()
					.getChartCode());

			jsonArray.put(receivable);
		}

		converter = jsonArray.toString();
		return Response.ok(converter).build();
	}

	/*
	 * //for retrieving
	 * 
	 * @GET
	 * 
	 * @Path("/Retrieve")
	 * 
	 * @Produces({ MediaType.APPLICATION_JSON}) public Response findAll() throws
	 * Exception { JSONArray jsonArray = new JSONArray(); String converter;
	 * 
	 * dao = new AccountsPayableDao(); List<AccountsPayable>
	 * results=dao.listAccountsPayables();
	 * 
	 * for (int i = 0; i < results.size(); i++) { JSONObject payable = new
	 * JSONObject(); payable.put("folioNr", results.get(i).getFolioNr());
	 * payable.put("amount", results.get(i).getAmount());
	 * payable.put("paymentDate", results.get(i).getPaymentDate());
	 * payable.put("paymentType", results.get(i).getPaymentType());
	 * payable.put("chartCode", results.get(i).getCharts());
	 * 
	 * jsonArray.put(payable); }
	 * 
	 * converter = jsonArray.toString(); return Response.ok(converter).build();
	 * }
	 */

}