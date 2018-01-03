package dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.postgresql.jdbc.PgStatement;

import control.ConnectionFactory;

public class Produtodao {
	public void create(){
	Connection con=ConnectionFactory.getConnection();
	PgStatement stmt=null;
	try{
		stmt=(PgStatement) con.prepareStatement("");
	}catch(SQLException e){
		throw new RuntimeException("Erro na criação no banco",e);
		
	}
	}

}
