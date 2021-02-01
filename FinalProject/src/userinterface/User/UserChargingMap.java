/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.User;
import Business.EcoSystem;
import Business.StationMap.ChargingStation;
import Business.StationMap.Coordinate;
import Business.StationMap.StationMap;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.frame.Frame;
import com.teamdev.jxbrowser.navigation.Navigation;
import com.teamdev.jxbrowser.permission.PermissionType;
import com.teamdev.jxbrowser.permission.callback.RequestPermissionCallback;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
/**
 *
 * @author adam
 */
public class UserChargingMap
{
    static EngineOptions options;
    static    Engine engine;
    static int count=0;
    
    public static void init(){
        if (count>0){return;}
        options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1FXD4D1UFHWBCLI8JKBBNZ26V2ITTTD98TD036NW61B3W6V7E8C0GNGD0CX7XA").build();
        
        count++;
    }
    public static void navi(Coordinate co){
        
//        engine.permissions().set(RequestPermissionCallback.class, (params, tell) -> {
//        PermissionType type = params.permissionType();
//        System.out.println(type.toString());
//        if (type == PermissionType.GEOLOCATION ) {
//            tell.grant();
//            System.out.println(1);
//        } else {
//            tell.deny();
//        }
//    });
        try{
            engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();
        
        SwingUtilities.invokeLater(() -> {
            // Creating Swing component for rendering web content
            // loaded in the given Browser instance.
            BrowserView view = BrowserView.newInstance(browser);
            
            JButton setMarkerButton = new JButton("Show Where you at");
            Frame frame =browser.frames().get(0);
            
            
            setMarkerButton.addActionListener((ActionEvent e) ->
            {
                frame.executeJavaScript("var myLatlng = new google.maps.LatLng("+co.getX()+","+co.getY()+");\n" +
                        "const image =\n" +
"    \"https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png\";"
                        +
                        "var marker = new google.maps.Marker({\n" +
                        "    position: myLatlng,\n" +
                        "    map: map,\n" +
                        "    icon:image" +
                        "});");
            }); 
            
   
            JPanel toolBar = new JPanel();
            toolBar.add(setMarkerButton);
            
            
            // Creating and displaying Swing app frame.
            JFrame mainframe = new JFrame("Charging Station Map");
            mainframe.add(toolBar,BorderLayout.SOUTH);
            // Close Engine and onClose app window
            mainframe.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    browser.close();
                    engine.close();
                    
                }
            });
            mainframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//            JTextField addressBar = new JTextField("https://maps.google.com");
//            addressBar.addActionListener(e ->
//                    browser.navigation().loadUrl(addressBar.getText()));
//            frame.add(addressBar, BorderLayout.NORTH);
            mainframe.add(view, BorderLayout.CENTER);
            mainframe.setSize(800, 500);
            mainframe.setLocationRelativeTo(null);
            mainframe.setVisible(true);
            String path = "file://"+System.getProperty("user.dir")+"/src/userinterface/User/showmap.html";
            System.out.println(path);
            Navigation navigation = browser.navigation();
            navigation.loadUrl(path);
        });
        
        }catch(Exception e){
            System.out.println("Clean up and please restart");
        }
        
    
    
    }
    public static void navi(EcoSystem system){
  
//        engine.permissions().set(RequestPermissionCallback.class, (params, tell) -> {
//        PermissionType type = params.permissionType();
//        System.out.println(type.toString());
//        if (type == PermissionType.GEOLOCATION ) {
//            tell.grant();
//            System.out.println(1);
//        } else {
//            tell.deny();
//        }
//    });
        try{
        engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();
        StationMap sm =system.getStationmap();
        List<Coordinate> coList = new ArrayList<Coordinate>();
        for (int i=0;i<sm.getMap().size();i++){
            coList.add(sm.getMap().get(i).getCoordinate());
            
        }
        SwingUtilities.invokeLater(() -> {
            // Creating Swing component for rendering web content
            // loaded in the given Browser instance.
            BrowserView view = BrowserView.newInstance(browser);
            JButton setMarkerButton = new JButton("Show Charging Station");
            setMarkerButton.addActionListener((ActionEvent e) ->{
            browser.mainFrame().ifPresent(frame -> {
                for (int i=0;i<coList.size();i++){
                    System.out.println(coList.get(i).getX());
                    System.out.println(coList.get(i).getY());
                frame.executeJavaScript("var myLatlng = new google.maps.LatLng("+coList.get(i).getX()+","+coList.get(i).getY()+");\n" +
                        "var marker = new google.maps.Marker({\n" +
                        "    position: myLatlng,\n" +
                        "    map: map" +
                        
                        
                        "});");
                }        
            
            });});
//            
//            for (int i=0;i<coList.size();i++){
                
                System.out.println("var myLatlng = new google.maps.LatLng("+coList.get(0).getX()+","+coList.get(0).getY()+");\n" +
                        "var marker = new google.maps.Marker({\n" +
                        "    position: myLatlng,\n" +
                        "    map: map" +
                        
                        "});");
//            }
            
            
            
   
            JPanel toolBar = new JPanel();
            toolBar.add(setMarkerButton);
            
            
            // Creating and displaying Swing app frame.
            JFrame mainframe = new JFrame("Charging Station Map");
            mainframe.add(toolBar,BorderLayout.SOUTH);
            // Close Engine and onClose app window
            mainframe.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    browser.close();
                    engine.close();
                    
                }
            });
            mainframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//            JTextField addressBar = new JTextField("https://maps.google.com");
//            addressBar.addActionListener(e ->
//                    browser.navigation().loadUrl(addressBar.getText()));
//            frame.add(addressBar, BorderLayout.NORTH);
            mainframe.add(view, BorderLayout.CENTER);
            mainframe.setSize(800, 500);
            mainframe.setLocationRelativeTo(null);
            mainframe.setVisible(true);
            String path = "file://"+System.getProperty("user.dir")+"/src/userinterface/User/showmap.html";
            
            Navigation navigation = browser.navigation();
            navigation.loadUrl(path);
        });
        }catch(Exception e){
            System.out.println("Clean up and please restart");
        }
        
    
    
    }
    
}
