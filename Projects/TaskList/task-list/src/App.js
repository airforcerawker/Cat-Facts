import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import {useState} from 'react';
import TaskCard from './components/TaskCard';
import TaskForm from './components/TaskForm';

function App() {

  //form manages the state of the form
  const [form, setForm] = useState({
    task: "",
    importance: "",
    details: ""
  })

  const handleForm = e => {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    })
  }

  //tasks manages the state of the tasks
  const [tasks, setTasks] = useState([
    {
      task: "Wash the car",
      importance: "Low",
      details: "People are writing messages in the dirt...yup."
    },
    {
      task: "File tax return",
      importance: "Medium",
      details: "You like extra money, right?  Right."
    },
    {
      task: "Walk the dog",
      importance: "High",
      details: "He's getting fat, ya know..."
    }
  ])

  const handleSubmit = (e) => {
    e.preventDefault();
    setTasks([...tasks,form]);
    setForm({
      task: "",
      importance: "",
      details: ""
    })
  }

  const deleteTask = (index) => {
    //...tasks.slice(0,index) handles everything before the task
    //...tasks.slice(index) handles everything after the task
    setTasks([...tasks.slice(0,index),...tasks.slice(index+1)])
  }

  return (
    <>
    <TaskForm inputs={form} handleForm={handleForm} handleSubmit={handleSubmit}/>
    <div className="d-flex justify-content-around border p-5">
      {
        tasks.map((tasks, i) => {
          return <TaskCard key={i} index={i} task={tasks.task} importance={tasks.importance} details={tasks.details} deleteTask={deleteTask} />
        })
      }
    </div>
    </>
  );
}

export default App;
