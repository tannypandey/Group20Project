import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import AllBonds from "C:/work/Group20Project/bonds-react-app/bonds-ui/src/components/AllBonds.jsx";
import Maturity from "C:/work/Group20Project/bonds-react-app/bonds-ui/src/components/Maturity.jsx";
import Books from "C:/work/Group20Project/bonds-react-app/bonds-ui/src/components/Books.jsx";
import Code from "C:/work/Group20Project/bonds-react-app/bonds-ui/src/components/Code.jsx";
import Issuer from "C:/work/Group20Project/bonds-react-app/bonds-ui/src/components/Issuer.jsx";
import Welcome from "C:/work/Group20Project/bonds-react-app/bonds-ui/src/components/Welcome.jsx";
import Counterparty from "C:/work/Group20Project/bonds-react-app/bonds-ui/src/components/Counterparty.jsx";
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Route, Routes } from 'react-router-dom';



function App() {
    return (
      <>
          <Navbar expand="lg" className="bg-body-tertiary">
            <Container>
              <Navbar.Brand>Deutsche Bank Bonds</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                  <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                      <Nav.Link href="/allbonds">All Bonds</Nav.Link>
                      <Nav.Link href="/maturity">Maturity</Nav.Link>
                      <Nav.Link href="/code">Code</Nav.Link>
                      <Nav.Link href="/issuer">Issuer</Nav.Link>
                      <Nav.Link href="/counterparty">Counterparty</Nav.Link>
                      <Nav.Link href="/books">Books</Nav.Link>
                    </Nav>
                  </Navbar.Collapse>
            </Container>    
          </Navbar>
          <Routes>
            <Route path="allbonds" element={<AllBonds/>}/>
            <Route path="bondsdetails" element={<Maturity/>}/>
            <Route path="code" element={<Code/>}/>
            <Route path="bondsdetails" element={<Issuer/>}/>
            <Route path="bondsdetails" element={<Counterparty/>}/>
            <Route path="bondsdetails" element={<Books/>}/>
            {/* <Route path="/" element={<Welcome/>}/> */}
          </Routes>
      </>
  );
}
export default App;