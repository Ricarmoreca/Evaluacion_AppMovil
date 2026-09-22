package com.example.evaluacin.model

data class Gadget(
    val id: Int,
    val nombre: String,
    val precio: Double,
    val calificacion: Double,
    val descripcionCorta: String,
    val descripcionLarga: String,
    val imagenUrl: String,
    val categoria: String
)

object DummyData {
    val gadgetsList = listOf(
        Gadget(
            id = 1,
            nombre = "Smartphone Alpha X",
            precio = 899.99,
            calificacion = 4.7,
            descripcionCorta = "Teléfono premium con pantalla OLED de 120Hz y cámara de 108 MP.",
            descripcionLarga = "El Smartphone Alpha X redefine la telefonía móvil con su procesador de última generación, almacenamiento ultra rápido de 256GB y una batería de 5000 mAh con carga súper rápida. Su pantalla OLED ofrece colores vibrantes y negros perfectos, ideales para disfrutar de contenido multimedia y videojuegos de alta exigencia.",
            imagenUrl = "https://images.unsplash.com/photo-1598327105666-5b89351aff97?w=500&auto=format&fit=crop&q=60",
            categoria = "Smartphones"
        ),
        Gadget(
            id = 2,
            nombre = "Laptop Quantum Pro",
            precio = 1499.50,
            calificacion = 4.9,
            descripcionCorta = "Laptop ultra delgada con procesador de 10 núcleos y 16GB de RAM.",
            descripcionLarga = "Diseñada para creadores de contenido y profesionales exigentes, la Laptop Quantum Pro cuenta con un chasis de aluminio aeroespacial, pantalla 4K IPS de 15.6 pulgadas y gráficos dedicados de última generación. Su teclado retroiluminado y sistema de enfriamiento avanzado garantizan largas sesiones de productividad sin sobrecalentamientos.",
            imagenUrl = "https://tecnopro.ec/wp-content/uploads/2026/08/LEGION-5-PRO-8122002-copia-18.webp",
            categoria = "Laptops"
        ),
        Gadget(
            id = 3,
            nombre = "Smartwatch Horizon Fit",
            precio = 249.99,
            calificacion = 4.5,
            descripcionCorta = "Reloj inteligente con monitor de ritmo cardíaco, GPS y resistencia al agua.",
            descripcionLarga = "Lleva tu entrenamiento al siguiente nivel con el Horizon Fit. Realiza un seguimiento preciso de más de 50 modos deportivos, mide la saturación de oxígeno en sangre (SpO2) y monitorea tus ciclos de sueño. Su batería de larga duración ofrece hasta 10 días de autonomía con una sola carga completa.",
            imagenUrl = "https://images.unsplash.com/photo-1508685096489-7aacd43bd3b1?w=500&auto=format&fit=crop&q=60",
            categoria = "Wearables"
        ),
        Gadget(
            id = 4,
            nombre = "Auriculares SoundPulse ANC",
            precio = 189.00,
            calificacion = 4.6,
            descripcionCorta = "Auriculares inalámbricos con cancelación activa de ruido híbrida.",
            descripcionLarga = "Aíslate del mundo exterior con los auriculares circumaurales SoundPulse ANC. Equipados con controladores dinámicos de 40 mm, ofrecen graves profundos y agudos cristalinos Cuentan con modo transparencia ambiental, micrófonos con reducción de ruido para llamadas claras y hasta 40 horas de reproducción continua.",
            imagenUrl = "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=500&auto=format&fit=crop&q=60",
            categoria = "Audio"
        ),
        Gadget(
            id = 5,
            nombre = "Consola PlayStation 5",
            precio = 499.99,
            calificacion = 4.8,
            descripcionCorta = "Consola de videojuegos de nueva generación para gaming a 4K 60FPS.",
            descripcionLarga = "La PlayStation 5 introduce una velocidad de carga asombrosa gracias a su unidad SSD personalizada de alta velocidad. Disfruta de gráficos con trazado de rayos (Ray Tracing) y una inmersión más profunda mediante retroalimentación háptica y gatillos adaptables en su control inalámbrico ergonómico.",
            imagenUrl = "https://images.unsplash.com/photo-1606813907291-d86efa9b94db?w=500&auto=format&fit=crop&q=60",
            categoria = "Gaming"
        ),
        Gadget(
            id = 6,
            nombre = "Tablet Samsung S9",
            precio = 599.99,
            calificacion = 4.4,
            descripcionCorta = "Tablet de 11 pulgadas con soporte para lápiz óptico y pantalla fluida.",
            descripcionLarga = "La Tablet Nebula Vision es la herramienta perfecta tanto para el estudio como para el entretenimiento. Cuenta con un procesador optimizado para multitarea, cuatro altavoces estéreo de alta fidelidad con Dolby Atmos y compatibilidad con Stylus de baja latencia para dibujar o tomar notas con precisión natural.",
            imagenUrl = "https://images.unsplash.com/photo-1511385348-a52b4a160dc2?w=500&auto=format&fit=crop&q=60",
            categoria = "Tablets"
        )
    )
}
