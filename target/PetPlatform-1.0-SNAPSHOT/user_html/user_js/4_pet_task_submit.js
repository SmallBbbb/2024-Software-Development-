document.getElementById('myDate').addEventListener('input', function() {
    var inputDate = this.value;
    //   var formattedDate = inputDate.split('-').reverse().join('-');
    // document.getElementById('formattedDate').innerText = formattedDate;
    var formattedDate = inputDate.split('-').join('-');
    document.getElementById('formattedDate').value = formattedDate;
});