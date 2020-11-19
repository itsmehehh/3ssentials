public class Main extends JavaPlugin;

import Override;

@Override
public void onEnable(){
  System.out.println("Plugin 3ssentials is now enabled.")
  
  getCommand("help").setExecutor(new Commands);
  
}

public void onDisable(){
  System.out.println("Plugin 3ssentials is now disabled.")
}
