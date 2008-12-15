package com.sa.xrace.client.model;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Vector;

import javax.microedition.khronos.opengles.GL10;

import android.app.Activity;


/**
 * @author sliao
 * @version $Id: t3DModel.java,v 1.5 2008-12-08 07:32:59 sliao Exp $
 */
/**
 *  This class is used to store the model data which is created by 3DS MAX.
 */
public class t3DModel 
{
	public int numOfObjects;							// number of objects
	public int numOfMaterials;							// number of material
	public Vector<tMaterialInfo> Materials;		// vectors keeping the materials
	public Vector<t3DObject> Objects;			// vectors keeping the objects
	private Activity mainAcivity;
	
	
	
	public t3DModel(Activity mainAcivity)
	{
		this.Materials = new Vector<tMaterialInfo>();
		this.Objects = new Vector<t3DObject>();
		this.mainAcivity = mainAcivity;
	}
	
	/**
	 *  This function would generate all the buffer for render according 
	 *  those data has been imported .
	 */
	public void generate(GL10 gl)
	{	
		Iterator<t3DObject> t3DObjectIterator = Objects.iterator();
		while (t3DObjectIterator.hasNext())
		{
			t3DObject object = t3DObjectIterator.next();
			if (object.materialID >= 0)
			{
				try {
					String strFilename = Materials.get(object.materialID).strFile;
					if (strFilename != null && !strFilename.equals(""))	
					{
						InputStream is = mainAcivity.getAssets().open(strFilename);
						DataInputStream dis = new DataInputStream(is);
						object.loadBitmap(gl, dis);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			object.createBuffer();
		}
	}

	
	/**
	 *  This function would render all objects in the model with the 
	 *  buffer that has been generated by function generate().
	 */
    public void draw(GL10 gl)
    {
		Iterator<t3DObject> t3DObjectIterator = Objects.iterator();
		while (t3DObjectIterator.hasNext())
		{
			t3DObject object = t3DObjectIterator.next();
			object.draw(gl);
		}
    }
    public t3DObject getObject(String objectName)
    {
		Iterator<t3DObject> t3DObjectIterator = Objects.iterator();
		while (t3DObjectIterator.hasNext())
		{
			t3DObject object = t3DObjectIterator.next();
			if (object.strName.equals(objectName))
			{
				return object;
			}
		}
		return null;    	
    }
}


/**
 *  This class is used to keep the material data.
 */
class tMaterialInfo 
{	
	public String strName;				// name of material
	public String strFile;				// texture's filename
	public byte[]  color;				// RGB color
	
	public tMaterialInfo() {
		color = new byte[3];
	}
	
}