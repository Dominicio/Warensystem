package IMT;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;

import static IMT.graphische.*;

public class SQLL extends Main {
    static Scanner scanner=new Scanner(System.in);
    public  SQLL() {

        graphische gui = new graphische();



            String url="jdbc:mysql://localhost:3306/imt";
            String user="root";
            String pass="";

            try {

                Connection con=DriverManager.getConnection(url,user,pass);
                Statement stm=con.createStatement();


                int wahl1=0;
                System.out.println("was wollen sie machen . (0 = Insert / 2 = Select )");
                wahl1=scanner.nextInt();
                if (wahl1 == 0) {


                    String sql=" insert into produkte (ArtikelNR, Name, Bestand, Preis)"
                            + " values (?,?,?,?)";

                    PreparedStatement preparedStatement=con.prepareStatement(sql);
                    System.out.print("Enter value for ArtikelNR: ");
                    int ArtikelNR= graphische.getBaumi();


                    System.out.print("Enter value for Name: ");
                    String Name = graphische.getBaumi2();

                    System.out.print("Enter value for Bestand: ");
                    int Bestand = graphische.getBaumi3();


                    System.out.print("Enter value for Preis: ");
                    double Preis = graphische.getBaumi4();



                    // Set the values for the parameters in the SQL query
                    preparedStatement.setInt(1,ArtikelNR);
                    preparedStatement.setString(2,Name);
                    preparedStatement.setInt(3,Bestand);
                    preparedStatement.setDouble(4,Preis);
                    preparedStatement.execute();



                    // Execute the SQL query to insert data
                    int rowsAffected=preparedStatement.executeUpdate();

                    // Check if the insertion was successful
                    if (rowsAffected > 0) {
                        System.out.println("Data inserted successfully!");
                    } else {
                        System.out.println("Failed to insert data.");

                    }

} if (wahl1 == 2) {
                    String abfrage="SELECT * FROM produkte";
                    ResultSet rs=stm.executeQuery(abfrage);
                    Statement st=con.createStatement();


                    while (rs.next()) {
                        System.out.println(rs.getString(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3) + " " +
                                rs.getString(4));





                    }

                }




            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }



}