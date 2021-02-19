
const TaskCard = props => {

    const {task, importance, details, index, deleteTask} = props;

    return <div className="card">
        <div className="card-body">
            <h4 className="card-title text-center">Task: {task}</h4>
            <h4 className="card-title text-center">Importance: {importance}</h4>
            <h4 className="card-title text-center">Details: {details}</h4>
        </div>
        <div className="card-footer">
            <div className="btn btn-info" onClick={()=>deleteTask(index)}>Delete</div>
        </div>
    </div>

}

export default TaskCard;