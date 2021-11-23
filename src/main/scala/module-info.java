module example_plugin {
    requires core;

    exports io.github.burbokop.magura.example_plugin;

    uses Plugin;
    provides Plugin with TestPlugin;
}