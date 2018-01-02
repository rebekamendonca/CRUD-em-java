package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.jdbc.PgResultSet;
import org.postgresql.jdbc.PgStatement;
public class ConnectionFactory {

	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/dbmercadinho";
	private final static String USER = "pgsql";
	private final static String PASS = "";
	
//Criando uma conexão
	public static Connection getConnection() {
		try {
			
			Class.forName(DRIVER); 
			return DriverManager.getConnection(URL, USER, PASS);
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Erro na conexão", e);
		}

	}
	
//fechando  a conexão com o banco
	public static void closeConnection(Connection con,PgStatement stmt,PgResultSet rs){
		closeConnection(con,stmt,rs);
			try {
				if(rs != null){
				((Connection) rs).close();
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Erro no fechamento da conexão com o banco de dados", e);
			}
			
		}
	}

