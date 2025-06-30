import { checkUsername, checkPhone } from './checkFn.js';
// 需求：表单校验--用户名：长度在4-16位；手机号：长度11位
// 分析：JS事件--鼠标离焦事件blur, 表单提交事件submit,, DOM操作
// 校验用户名
// 1.获取dom元素
document.querySelector("#username").addEventListener('blur', checkUsername)


document.querySelector("#phone").addEventListener('blur', checkPhone);

// 表单提交时，需要校验整个表单是否合法，如果不合法不让提交
document.querySelector("form").addEventListener("submit", (event) => {
    if (!checkUsername() || !checkPhone()) {
        alert("用户名或手机号不合法！");
        //阻止表单提交
        event.preventDefault();
    }
})

