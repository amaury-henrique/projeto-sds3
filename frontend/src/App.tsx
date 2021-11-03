import DataTable from "Components/DataTable";
import Footer from "Components/Footer";
import NavBar from "Components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Ola Mundo!!!</h1>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
