import requests
from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
from kivy.uix.label import Label

class PoliMarketApp(App):
    def build(self):
        self.layout = BoxLayout(orientation='vertical')
        self.btn = Button(text="Cargar Productos")
        self.btn.bind(on_press=self.cargar_productos)
        self.layout.add_widget(self.btn)
        return self.layout

    def cargar_productos(self, instance):
        try:
            response = requests.get("http://localhost:8080/bodega/productos")
            productos = response.json()
            for p in productos:
                self.layout.add_widget(Label(text=f"{p['nombre']} - ${p['precio']}"))
        except Exception as e:
            self.layout.add_widget(Label(text=f"Error: {str(e)}"))

if __name__ == '__main__':
    PoliMarketApp().run()
