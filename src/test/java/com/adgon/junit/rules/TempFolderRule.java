package com.adgon.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TempFolderRule {

    @Rule
    public final TemporaryFolder temporaryFolder = new TemporaryFolder();

    // As for v4.13 TemporaryFolder optionally allows strict verification of deleted resources
//    @Rule
//    public final TemporaryFolder folder = TemporaryFolder.builder().assureDeletion().build();

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void countsAssets() throws IOException {
        File icon = temporaryFolder.newFile("icon.png");
        File assets = temporaryFolder.newFolder("assets");
        createAssets(assets, 3);
    }

    @Test
    public void throwsIllegalArgumentExceptionIconIsNull() throws IllegalAccessException {
        exception.expect(IllegalAccessException.class);
        exception.expectMessage("Icon is null.");
        new DigitalAssetManager(null, null);
    }

    private void createAssets(File assets, int numberOfAssets) throws IOException {
        for (int index = 0; index < numberOfAssets; index++) {
            File asset = new File(assets, String.format("asset-%d.mpg", index));
            assertTrue("Asset couldn't be created.", asset.createNewFile());
        }
    }

    private class DigitalAssetManager {

        DigitalAssetManager(Icon icon, String path) throws IllegalAccessException {
            if (icon == null) {
                throw new IllegalAccessException("Icon is null.");
            }
        }

    }
}
