package dbconnect;



import java.sql.ResultSet;



public class DBconnect_main {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ResultSet rs;

		

		MySQL mysql = new MySQL();

		

		rs=mysql.selectAll();

		

		DBGraph graph = new DBGraph(rs);

		graph.setBounds(5,5,655,455);

		graph.setVisible(true);

	}



}