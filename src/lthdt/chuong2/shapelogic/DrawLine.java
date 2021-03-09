/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.shapelogic;

import java.awt.Graphics2D;

/**
 *
 * @author Administrator
 */
public class DrawLine {
    private Graphics2D gr;
    private Line line;

    public DrawLine() {
    }

    public DrawLine(Graphics2D gr, Line line) {
        this.gr = gr;
        this.line = line;
    }

    public Graphics2D getGr() {
        return gr;
    }

    public void setGr(Graphics2D gr) {
        this.gr = gr;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
    
    
    public void veDuongThang() {
        gr.drawLine(line.getBegin_x(),
                    line.getBegin_y(),
                    line.getEnd_x(),
                    line.getEnd_y());
    }
    
    
}
