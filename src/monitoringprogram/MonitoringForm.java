/*
 * PROGRAM: Monitoring Program
 * Author: Kim Long
 * ID: 470962509
 * VERSION: R.1.2
 * INPUT: Standard input
 * OUTPUT: Standard Output
 * Note: This is for Monitotring Station
 */
package monitoringprogram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author student
 */
public class MonitoringForm extends javax.swing.JFrame
{

    /**
     * Creates new form MonitoringForm
     */
    public MonitoringForm()
    {
        initComponents();
        getParameters();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLane = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalVehicle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAvgVehicles = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAvgVelocity = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtStation = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnConnect = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Monitoring Station");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Time");

        txtTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Location");

        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Lane");

        txtLane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total Vehicles");

        txtTotalVehicle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Avg Vehicles");

        txtAvgVehicles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Avg Velocity");

        txtAvgVelocity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Station");

        txtStation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnConnect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(210, Short.MAX_VALUE)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTime)
                            .addComponent(txtLocation)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAvgVehicles, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalVehicle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLane)
                            .addComponent(txtAvgVelocity)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtStation)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAvgVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAvgVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnExit)
                    .addComponent(btnConnect))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConnectActionPerformed
    {//GEN-HEADEREND:event_btnConnectActionPerformed
        connect(serverName, serverPort);
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubmitActionPerformed
    {//GEN-HEADEREND:event_btnSubmitActionPerformed
        if (txtStation.getText() != null && txtTime.getText() != null && txtLocation.getText() != null
                && txtLane.getText() != null && txtTotalVehicle.getText() != null && txtAvgVehicles.getText() != null && txtAvgVelocity.getText() != null)

        {
            send(txtStation.getText() + "," + txtTime.getText() + "," + txtLocation.getText() + ","
                    + txtLane.getText() + "," + txtTotalVehicle.getText() + "," + txtAvgVehicles.getText() + "," + txtAvgVelocity.getText());
            txtStation.setText("");
            txtTime.setText("");
            txtLocation.setText("");
            txtLane.setText("");
            txtTotalVehicle.setText("");
            txtAvgVehicles.setText("");
            txtAvgVelocity.setText("");
        } else
        {
            println("There is empty space");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        send(".bye");
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    //SEVER RELATED ---------------------------
    private Socket socket = null;
    private DataInputStream console = null;
    private DataOutputStream streamOut = null;
    private MonitoringStationThread client = null;
    private String serverName = "localhost";
    private int serverPort = 4444;
    public String message;

    // NEW -----------------------------------
    static int numberOfStation = 50;
    static int currentStation = 0;
    static TrafficData wordList[] = new TrafficData[numberOfStation];
    //----------------------------------------

    public void connect(String serverName, int serverPort)
    {
        println("Establishing connection. Please wait ...");
        try
        {
            socket = new Socket(serverName, serverPort);
            println("Connected: " + socket);
            open();
        } catch (UnknownHostException uhe)
        {
            println("Host unknown: " + uhe.getMessage());
        } catch (IOException ioe)
        {
            println("Unexpected exception: " + ioe.getMessage());
        }
    }

//    private void send()
//    {
//        try
//        {
//            streamOut.writeUTF(txtWord1.getText());
//            streamOut.flush();
//            txtWord1.setText("");
//        }
//        catch (IOException ioe)
//        {
//            println("Sending error: " + ioe.getMessage());
//            close();
//        }
//    }
    private void send(String Data)
    {
        try
        {
            streamOut.writeUTF(Data);
            streamOut.flush();
        } catch (IOException ioe)
        {
            println("Sending error: " + ioe.getMessage());
            close();
        }
    }

    public void handle(String msg)
    {
        String msgtemp[] = msg.split(" ");

        if (msgtemp[1].equals("checkstatus"))
        {
            send("good");
            println(msg);
        } else
        {

            println(msg);

            // NEW -----------------------------------
//            currentStation++;
//            wordList[currentStation] = new TrafficData(msg);
//            for (int i = 0; i < currentStation; i++)
//            {
//                System.out.println("Handle Method: " + i + " - " + wordList[i].words);
//            }
            //----------------------------------------
        }

    }

    public void open()
    {
        try
        {
            streamOut = new DataOutputStream(socket.getOutputStream());
            client = new MonitoringStationThread(this, socket);
        } catch (IOException ioe)
        {
            println("Error opening output stream: " + ioe);
        }
    }

    public void close()
    {
        try
        {
            if (streamOut != null)
            {
                streamOut.close();
            }
            if (socket != null)
            {
                socket.close();
            }
        } catch (IOException ioe)
        {
            println("Error closing ...");
        }
        client.close();
        client.stop();
    }

    void println(String msg)
    {
        //display.appendText(msg + "\n");
        message = msg;
        lblMessage.setText(message);
    }

    public void getParameters()
    {
//        serverName = getParameter("host");
//        serverPort = Integer.parseInt(getParameter("port"));

        serverName = "localhost";
        serverPort = 4444;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MonitoringForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MonitoringForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextField txtAvgVehicles;
    private javax.swing.JTextField txtAvgVelocity;
    private javax.swing.JTextField txtLane;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtStation;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTotalVehicle;
    // End of variables declaration//GEN-END:variables
}
