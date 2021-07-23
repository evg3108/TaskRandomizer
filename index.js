class Task {
    constructor(title) {
        this.title = title
    }


}


class List {
    constructor() {
        this.tasks = new Array()
    }

    addTaskToList(task) {
        this.tasks.push(task)
    }

    findTask(task) {
        let rightOne
        for (let item of this.tasks) {
            if (item.title === task.title) {
                rightOne = item
            }
        }
        return rightOne
    }

}

function createNewTask(title) {
    let element = document.createElement("input")
    element.setAttribute("type", "button")
    element.setAttribute("value", title)
    // element.setAttribute("name", this.title)
    // element.setAttribute("onclick", "foo()")
    return new Task(title)
}



function createNewList(id) {
    let element = document.createElement("div")
    element.setAttribute("class", "list")
    element.setAttribute("id", id)
    element.innerHTML = `<p><h1 align="center">${id}</h1></p>`
    document.getElementById("listsContainer").appendChild(element)
}


function newList() {
    let listName = prompt("Введите имя списка:", "")
    createNewList(listName)
}

function newTask() {
    let taskName = prompt("Введите текст задачи:", "Полить цветы")
    let listName = prompt("В какой список занести задачу?", "")
    let task = createNewTask(taskName)
    let element = document.createElement("div")
    element.setAttribute("class", "task")
    element.setAttribute("id", task.title)
    element.innerHTML = `<h3 align="center">${taskName}</h3>`
    document.getElementById(listName).appendChild(element)
}