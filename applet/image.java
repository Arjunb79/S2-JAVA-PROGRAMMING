import java.awt.*;  
import java.applet.*;  
   /* 
<applet code="image.class" width="500" height="400"> 
</applet> 
*/   
  
public class image extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"download.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
      
  }  
