export let checkUsername = () => {
    let flag = true;//用来标识用户名是否合法
    let usernameValue = document.querySelector("#username").value;
    if (!/\w{4,16}/.test(usernameValue)) {
        // alert("用户名长度不合法");
        document.querySelector("#name_msg").innerHTML = "用户名长度不合法";
        flag = false;
    } else {
        document.querySelector("#name_msg").innerHTML = "";
    }
    return flag;
}

export let checkPhone = () => {
    let flag = true;
    let phoneValue = document.querySelector("#phone").value;
    if (!/^1[3-9]\d{9}$/.test(phoneValue)) {
        // alert("手机号不合法");
        document.querySelector("#phone_msg").innerHTML = "手机号不合法";
        flag = false;
    } else {
        document.querySelector("#phone_msg").innerHTML = "";
    }
    return flag;
}