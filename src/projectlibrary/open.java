/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
/**
 *
 * @author wowya
 */
public class open {
     private String filePath;
     
    public open(String nm) {
     this.filePath = "E://down//"+nm+".pdf";
     SwingController controller = new SwingController();

        SwingViewBuilder factory = new SwingViewBuilder(controller);

        JPanel viewerComponentPanel = factory.buildViewerPanel();

        controller.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                        controller.getDocumentViewController()));

        JFrame applicationFrame = new JFrame();
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //applicationFrame.getContentPane().add(viewerComponentPanel);
        applicationFrame.add(viewerComponentPanel);
        
        controller.openDocument(filePath);

        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }
    
}
