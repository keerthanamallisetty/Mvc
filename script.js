document.getElementById("greetButton").addEventListener("click", async () => {
    const name = document.getElementById("name").value.trim();
    const result = document.getElementById("result");

    try {
        const response = await fetch(`/api/greet?name=${encodeURIComponent(name)}`);
        const data = await response.json();
        result.textContent = data.name;
    } catch (error) {
        result.textContent = "Unable to connect to the Java server.";
    }
});
