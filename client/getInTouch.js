const API_URL = "http://192.168.10.195:8080/ChristmasNotAlone/";
window.onload = async function () {
  
    const familyId = getFamilyIdFromURL();
    await getFamilyDescription(familyId);
    console.log(getFamilyDescription(familyId));
}


function getFamilyIdFromURL() {
    const urlParams = new URLSearchParams(window.location.search);
    return urlParams.get('id');
  }
  

  async function getFamilyDescription(id) {
    try {
      const response = await fetch(`${API_URL}${id}`);
      console.log(response);
      if (!response.ok) {
        throw new Error("Family not found");
      }
      const family = await response.json();
      displayFamilyDescription(family);
    } catch (error) {
      console.error("Error fetching family description", error);
    }
  }


  function displayFamilyDescription(family) {
    const h2 = document.querySelector("#description");
    h2.innerHTML = `
      <p style="padding: 20px; letter-spacing: 2px; line-height: 25px;">${family.description}</p>
    `;
  }

