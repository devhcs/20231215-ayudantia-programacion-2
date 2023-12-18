package cl.stgoneira.android.a20231215_ayudantia_programacion_2.modelo

class Promedio {

    val notas = mutableListOf<Float>()

    fun agregarNota(nota:Float) {
        notas.add(nota)
    }

    /*
    Esta función calcula el promedio
     */
    fun calcularPromedio():Float {
        if(notas.size == 0) return 1.0f
        return notas.sum() / notas.size
    }
}