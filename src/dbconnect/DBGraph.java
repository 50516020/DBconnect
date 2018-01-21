package dbconnect;



import java.awt.BorderLayout;

import java.awt.FlowLayout;

import java.awt.Frame;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

import java.sql.ResultSet;

import java.sql.SQLException;



import org.jfree.chart.ChartFactory;

import org.jfree.chart.ChartPanel;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.DefaultCategoryDataset;



public class DBGraph extends Frame implements ActionListener,WindowListener {



	private DefaultCategoryDataset data = new DefaultCategoryDataset();

	private JFreeChart chart = 

		      ChartFactory.createBarChart("Import Volume","Year","Ton",data,PlotOrientation.VERTICAL,true,false,false);

	private ChartPanel cpanel = new ChartPanel(chart);

	

	public DBGraph(ResultSet rs) {

		addWindowListener(this);

		setTitle("DBconnect");

		setLayout(new FlowLayout());

		

		add(cpanel);

		try {

		while(rs.next()){

            data.addValue(rs.getInt("ton"), rs.getString("name"), rs.getString("year"));

        }

		}catch(SQLException e) {

			e.printStackTrace();

		}	

	}



	@Override

	public void windowActivated(WindowEvent e) {

		// TODO Auto-generated method stub

		

	}



	@Override

	public void windowClosed(WindowEvent e) {

		// TODO Auto-generated method stub

		

	}



	@Override

	public void windowClosing(WindowEvent e) {

		// TODO Auto-generated method stub

		System.exit(0);

	}



	@Override

	public void windowDeactivated(WindowEvent e) {

		// TODO Auto-generated method stub

		

	}



	@Override

	public void windowDeiconified(WindowEvent e) {

		// TODO Auto-generated method stub

		

	}



	@Override

	public void windowIconified(WindowEvent e) {

		// TODO Auto-generated method stub

		

	}



	@Override

	public void windowOpened(WindowEvent e) {

		// TODO Auto-generated method stub

		

	}



	@Override

	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		

	}

	

}