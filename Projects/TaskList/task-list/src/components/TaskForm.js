const TaskForm = props => {

    const {inputs, handleSubmit, handleForm} = props;

    return (

        <form onSubmit={handleSubmit} className="col-5 mx-auto">
            <h1 className="text-center">Add a Task!</h1>
            <div className="form-group mt-3">
                <label>Task:</label>
                <input type="text" name="task" value={inputs.task} onChange={handleForm} className="form-control" />
                <label>Importance:</label>
                <input type="text" name="importance" value={inputs.importance} onChange={handleForm} className="form-control" />
                <label>Details:</label>
                <input type="text" name="details" value={inputs.details} onChange={handleForm} className="form-control" />
                <input type="submit" value="Add Task" className="btn btn-primary mt-4" />
            </div>
        </form>

    );

}

export default TaskForm;