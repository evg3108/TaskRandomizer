class Task {
    constructor(title){
        this.title = title
        
    }

    

}


class List {
    constructor(){
        this.tasks = new Array()
    }

    addTaskToList(task){
        this.tasks.push(task)
    }

    findTask(task){
        let rightOne
        for (let item of this.tasks){
            if (item.name === task.name) {
                rightOne = item
            }
        }
        return rightOne
    }

}

