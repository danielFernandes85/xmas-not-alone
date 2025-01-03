async function submitData(event){
    event.preventDefault();

    const dataObject = {
        familyName: document.getElementById("familyName").value,
        email: document.getElementById("email").value,
        phone: document.getElementById("phone").value,
        zipCode: document.getElementById("zipCode").value,
        pets: document.getElementById("pets").value,
        meal: document.getElementById("meal").value,
        description: document.getElementById("description").value,
        available: document.getElementById("available").value,
    };
    try {
        const response = await fetch('http://192.168.10.195:8080/ChristmasNotAlone/', {
            method: 'POST',
            headers: {
                'Content-Type' : 'application/json',
            },
            body: JSON.stringify(dataObject),
        });

        console.log('The object after stringyfy', JSON.stringify(dataObject));
        console.log('The response was', response);

        if (response.ok){
            const responseData = await response.json();
            console.log("Thank you for your registration. Mery Christmas!", responseData);
            alert("Thank you for your registration. Mery Christmas!");
            window.location.href = "/home.html";
        } else {
            console.error("Error adding object:", response.statusText);
            alert("Please, check your information again.");
        }
    } catch (error){
        console.log(response);
        console.error("Error occurred:", error);
        alert("An error occurred while submiting the data.");
    }
}

document.getElementById("submit-button").addEventListener("click", submitData);