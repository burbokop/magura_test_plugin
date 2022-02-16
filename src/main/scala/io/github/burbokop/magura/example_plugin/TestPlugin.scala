package io.github.burbokop.magura.example_plugin

import io.github.burbokop.magura.api.Plugin

import java.lang.module._


class TestPlugin extends Plugin {
  override def init(): Int = 0
  override def name(): String = (new SomeClass).someFunc()
}
