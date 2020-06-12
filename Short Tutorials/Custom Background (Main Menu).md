# Custom Background for your Main Menu
Open `GuiMainMenu.java` located in `net.minecraft.client.gui` 
Go to the `drawScreen()` method and add these two lines below `drawDefaultBackground()`.

****
`Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("file location here");`

`Gui.drawScaledCustomSizeModalRect(0, 0, 0, 0, this.width, this.height, this.width, this.height, this.width, this.height);`
