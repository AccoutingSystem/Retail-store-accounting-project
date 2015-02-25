package acc.service;

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

import acc.dao.ChartOfAccountsDao;
import acc.pojo.ChartOfAccounts;

@Path("/ChartOfAccounts")
public class ChartOfAccountsRest {

	ChartOfAccountsDao dao = null;

	@POST
	@Path("/Save")
	// @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void addChartOfAccounts(ChartOfAccounts accounts) {
		
		dao = new ChartOfAccountsDao();
		dao.saveChartOfAccounts(accounts);
	}

	// for updating
	@PUT
	@Path("/Update")
	// @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.TEXT_HTML)
	public void update(ChartOfAccounts updateChart) {

		dao = new ChartOfAccountsDao();
		dao.update(updateChart);
	}

	// for deleting

	@DELETE
	@Path("{Chart_Code}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("Chart_Code") Long accountId) {
		
		dao = new ChartOfAccountsDao();
		dao.remove(accountId);
	}

	// search
	@GET
	@Path("/Search")
	@Produces({ MediaType.APPLICATION_JSON })
	public String searchChart(@QueryParam("key") Long id) throws Exception {
		
		dao = new ChartOfAccountsDao();
		ChartOfAccounts chartAccount = (ChartOfAccounts) dao.search(id);

		JSONObject chart = new JSONObject();
		chart.put("chartCode", chartAccount.getChartCode());
		chart.put("chartDescription", chartAccount.getChartDescription());
		chart.put("chartType", chartAccount.getChartType());

		String str = chart.toString();
		return str;
	}

	// for retrieving
	@GET
	@Path("/Retrieve")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() throws JSONException {
		
		JSONArray jsonArray = new JSONArray();
		String converter;

		Response rs = null;
		dao = new ChartOfAccountsDao();
		List<ChartOfAccounts> results = dao.listChartOfAccounts();

		for (int i = 0; i < results.size(); i++) {
			JSONObject chart = new JSONObject();
			chart.put("chartCode", results.get(i).getChartCode());
			chart.put("chartDescription", results.get(i).getChartDescription());
			chart.put("chartType", results.get(i).getChartType());

			jsonArray.put(chart);
		}
		
		converter = jsonArray.toString();
		return Response.ok(converter).build();
	}

}