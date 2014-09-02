package org.osmdroid.tileprovider.constants;

import android.os.Environment;

import java.io.File;

/**
 * @author nightfixed
 */
public class OpenStreetMapTileProviderTilesFolder {

	/**
	 * Base path for osmdroid files. Zip files are in this folder.<br/>
	 * <br/>
	 * 
	 * If you want to be able to cache the tiles relative to your app's local data, use:
	 * <b>OpenStreetMapTileProviderTilesFolder.OSMDROID_PATH = new File(FileUtils.getStorage(this),
	 * "osmdroid");</b> <br/>
	 * in your MainActivity's onCreate(), in order to override this value.
	 */
	public static File OSMDROID_PATH = new File(Environment.getExternalStorageDirectory(),
			"osmdroid");

}
