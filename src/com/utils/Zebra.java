package com.utils;

import com.model.Visitante;
import com.view.JPCadastro;
import fr.w3blog.zpl.constant.ZebraFont;
import fr.w3blog.zpl.model.ZebraLabel;
import fr.w3blog.zpl.model.ZebraPrintException;
import fr.w3blog.zpl.model.element.ZebraText;
import fr.w3blog.zpl.utils.ZebraUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zebra {
    private final String IP = "10.40.17.99";
    
    public static void print(Visitante visitante){
        ZebraLabel zebraLabel = new ZebraLabel(550,200);
        zebraLabel.setDefaultZebraFont(ZebraFont.ZEBRA_ZERO);
        zebraLabel.addElement(new ZebraText(20,60, visitante.getNome(), 8));
        zebraLabel.addElement(new ZebraText(20,100, visitante.getNomeMae(), 7));
        zebraLabel.addElement(new ZebraText(20,140, visitante.getLocal(), 7));
        zebraLabel.addElement(new ZebraText(20,180, visitante.getVinculo(), 7));
        
        try {
            ZebraUtils.printZpl(zebraLabel, "10.40.17.99", 9100);
        } catch (ZebraPrintException ex) {
            Logger.getLogger(JPCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
