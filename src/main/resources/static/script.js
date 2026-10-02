const form=document.getElementById("travelForm"),message=document.getElementById("message");
form.addEventListener("submit",async e=>{
 e.preventDefault();
 const data={
  name:document.getElementById("name").value,
  email:document.getElementById("email").value,
  phone:document.getElementById("phone").value,
  fromLocation:document.getElementById("fromLocation").value,
  destination:document.getElementById("destination").value,
  travelDate:document.getElementById("travelDate").value,
  travelers:parseInt(document.getElementById("travelers").value),
  travelType:document.getElementById("travelType").value,
  specialRequests:document.getElementById("specialRequests").value
 };
 try{
  const r=await fetch("/api/travel-details",{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(data)});
  if(!r.ok) throw new Error();
  const result=await r.json();
  message.style.color="green";
  message.textContent="✅ Booking registered successfully! Booking ID: "+result.id;
  form.reset();
 }catch(err){
  message.style.color="red";
  message.textContent="❌ Unable to register booking. Please try again.";
 }
});
