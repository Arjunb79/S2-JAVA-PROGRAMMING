import java.awt.*;  
import java.applet.*;  
  /* 
<applet code="animation.class" width="500" height="400"> 
</applet> 
*/   
  
public class animation extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture =getImage(getDocumentBase(),"download.jpg");  
  }  
    
  public void paint(Graphics g) {  
    for(int i=0;i<500;i++){  
      g.drawImage(picture, i,30, this);  
  
      try{Thread.sleep(100);}catch(Exception e){}  
    }  
  }  
}  
