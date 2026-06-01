// BOTÓN AGENDAR
const botonAgendar = document.querySelector(".hero-agenda button");

botonAgendar.addEventListener("click", () => {
    const servicio = document.querySelectorAll("select")[0].value;
    const profesional = document.querySelectorAll("select")[1].value;
    const fecha = document.querySelector("input[type='date']").value;
    const hora = document.querySelector("input[type='time']").value;

    if (!fecha || !hora) {
        alert("Por favor selecciona fecha y hora");
        return;
    }

    alert(`Cita agendada:
Servicio: ${servicio}
Profesional: ${profesional}
Fecha: ${fecha}
Hora: ${hora}`);
});


// BOTONES DE TARJETAS
const botonesSeleccionar = document.querySelectorAll(".card button");

botonesSeleccionar.forEach((boton, index) => {
    boton.addEventListener("click", () => {

        const servicios = [
            "Manicura Semipermanente",
            "PediSpa Relajante",
            "Recubrimiento Polygel"
        ];

        document.querySelectorAll("select")[0].value = servicios[index];

        window.scrollTo({
            top: 0,
            behavior: "smooth"
        });
    });
});

const menuToggle = document.querySelector(".menu-toggle");
const nav = document.querySelector("nav");

menuToggle.addEventListener("click", () => {
    nav.classList.toggle("active");
});