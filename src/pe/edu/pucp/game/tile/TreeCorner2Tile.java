/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.game.tile;

import java.io.Serializable;

import pe.edu.pucp.game.gfx.Assets;

@SuppressWarnings("serial")
public class TreeCorner2Tile extends Tile implements Serializable{
    public TreeCorner2Tile(int id) {
        super(Assets.treeCorner2, id);
        solid = true;
        // TODO Auto-generated constructor stub
    }

    public TreeCorner2Tile() {
    }

    @Override
    public boolean isSolid() {
        return solid;
    }
}