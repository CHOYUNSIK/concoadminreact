// import '/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/css/bootstrap.min.css';
// import '/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/css/sb-admin.css';
// import '/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/font-awesome/css/font-awesome.min.css';

import React from 'react';
import ReactDOM from 'react-dom';

class TablePage extends React.Component {
    render() {
        return (<div className="main">
            <div className="row">
                <div className="col-lg-12">
                    <h1 className="page-header">
                        Tables
                        </h1>
                    <ol className="breadcrumb">
                        <li>
                            <i className="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                        </li>
                        <li className="active">
                            <i className="fa fa-table"></i> Tables
                        </li>
                    </ol>
                </div>
            </div>
            <div className="row">
                <div className="col-lg-6">
                    <h2>Bordered Table</h2>
                    <div className="table-responsive">
                        <table className="table table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Page</th>
                                    <th>Visits</th>
                                    <th>% New Visits</th>
                                    <th>Revenue</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>/index.html</td>
                                    <td>1265</td>
                                    <td>32.3%</td>
                                    <td>$321.33</td>
                                </tr>
                                <tr>
                                    <td>/about.html</td>
                                    <td>261</td>
                                    <td>33.3%</td>
                                    <td>$234.12</td>
                                </tr>
                                <tr>
                                    <td>/sales.html</td>
                                    <td>665</td>
                                    <td>21.3%</td>
                                    <td>$16.34</td>
                                </tr>
                                <tr>
                                    <td>/blog.html</td>
                                    <td>9516</td>
                                    <td>89.3%</td>
                                    <td>$1644.43</td>
                                </tr>
                                <tr>
                                    <td>/404.html</td>
                                    <td>23</td>
                                    <td>34.3%</td>
                                    <td>$23.52</td>
                                </tr>
                                <tr>
                                    <td>/services.html</td>
                                    <td>421</td>
                                    <td>60.3%</td>
                                    <td>$724.32</td>
                                </tr>
                                <tr>
                                    <td>/blog/post.html</td>
                                    <td>1233</td>
                                    <td>93.2%</td>
                                    <td>$126.34</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div className="col-lg-6">
                    <h2>Bordered with Striped Rows</h2>
                    <div className="table-responsive">
                        <table className="table table-bordered table-hover table-striped">
                            <thead>
                                <tr>
                                    <th>Page</th>
                                    <th>Visits</th>
                                    <th>% New Visits</th>
                                    <th>Revenue</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>/index.html</td>
                                    <td>1265</td>
                                    <td>32.3%</td>
                                    <td>$321.33</td>
                                </tr>
                                <tr>
                                    <td>/about.html</td>
                                    <td>261</td>
                                    <td>33.3%</td>
                                    <td>$234.12</td>
                                </tr>
                                <tr>
                                    <td>/sales.html</td>
                                    <td>665</td>
                                    <td>21.3%</td>
                                    <td>$16.34</td>
                                </tr>
                                <tr>
                                    <td>/blog.html</td>
                                    <td>9516</td>
                                    <td>89.3%</td>
                                    <td>$1644.43</td>
                                </tr>
                                <tr>
                                    <td>/404.html</td>
                                    <td>23</td>
                                    <td>34.3%</td>
                                    <td>$23.52</td>
                                </tr>
                                <tr>
                                    <td>/services.html</td>
                                    <td>421</td>
                                    <td>60.3%</td>
                                    <td>$724.32</td>
                                </tr>
                                <tr>
                                    <td>/blog/post.html</td>
                                    <td>1233</td>
                                    <td>93.2%</td>
                                    <td>$126.34</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>


            <div className="row">
                <div className="col-lg-6">
                    <h2>Basic Table</h2>
                    <div className="table-responsive">
                        <table className="table table-hover">
                            <thead>
                                <tr>
                                    <th>Page</th>
                                    <th>Visits</th>
                                    <th>% New Visits</th>
                                    <th>Revenue</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>/index.html</td>
                                    <td>1265</td>
                                    <td>32.3%</td>
                                    <td>$321.33</td>
                                </tr>
                                <tr>
                                    <td>/about.html</td>
                                    <td>261</td>
                                    <td>33.3%</td>
                                    <td>$234.12</td>
                                </tr>
                                <tr>
                                    <td>/sales.html</td>
                                    <td>665</td>
                                    <td>21.3%</td>
                                    <td>$16.34</td>
                                </tr>
                                <tr>
                                    <td>/blog.html</td>
                                    <td>9516</td>
                                    <td>89.3%</td>
                                    <td>$1644.43</td>
                                </tr>
                                <tr>
                                    <td>/404.html</td>
                                    <td>23</td>
                                    <td>34.3%</td>
                                    <td>$23.52</td>
                                </tr>
                                <tr>
                                    <td>/services.html</td>
                                    <td>421</td>
                                    <td>60.3%</td>
                                    <td>$724.32</td>
                                </tr>
                                <tr>
                                    <td>/blog/post.html</td>
                                    <td>1233</td>
                                    <td>93.2%</td>
                                    <td>$126.34</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div className="col-lg-6">
                    <h2>Striped Rows</h2>
                    <div className="table-responsive">
                        <table className="table table-hover table-striped">
                            <thead>
                                <tr>
                                    <th>Page</th>
                                    <th>Visits</th>
                                    <th>% New Visits</th>
                                    <th>Revenue</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>/index.html</td>
                                    <td>1265</td>
                                    <td>32.3%</td>
                                    <td>$321.33</td>
                                </tr>
                                <tr>
                                    <td>/about.html</td>
                                    <td>261</td>
                                    <td>33.3%</td>
                                    <td>$234.12</td>
                                </tr>
                                <tr>
                                    <td>/sales.html</td>
                                    <td>665</td>
                                    <td>21.3%</td>
                                    <td>$16.34</td>
                                </tr>
                                <tr>
                                    <td>/blog.html</td>
                                    <td>9516</td>
                                    <td>89.3%</td>
                                    <td>$1644.43</td>
                                </tr>
                                <tr>
                                    <td>/404.html</td>
                                    <td>23</td>
                                    <td>34.3%</td>
                                    <td>$23.52</td>
                                </tr>
                                <tr>
                                    <td>/services.html</td>
                                    <td>421</td>
                                    <td>60.3%</td>
                                    <td>$724.32</td>
                                </tr>
                                <tr>
                                    <td>/blog/post.html</td>
                                    <td>1233</td>
                                    <td>93.2%</td>
                                    <td>$126.34</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>


            <div className="row">
                <div className="col-lg-6">
                    <h2>Contextual classNamees</h2>
                    <div className="table-responsive">
                        <table className="table table-bordered table-hover table-striped">
                            <thead>
                                <tr>
                                    <th>Page</th>
                                    <th>Visits</th>
                                    <th>% New Visits</th>
                                    <th>Revenue</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr className="active">
                                    <td>/index.html</td>
                                    <td>1265</td>
                                    <td>32.3%</td>
                                    <td>$321.33</td>
                                </tr>
                                <tr className="success">
                                    <td>/about.html</td>
                                    <td>261</td>
                                    <td>33.3%</td>
                                    <td>$234.12</td>
                                </tr>
                                <tr className="warning">
                                    <td>/sales.html</td>
                                    <td>665</td>
                                    <td>21.3%</td>
                                    <td>$16.34</td>
                                </tr>
                                <tr className="danger">
                                    <td>/blog.html</td>
                                    <td>9516</td>
                                    <td>89.3%</td>
                                    <td>$1644.43</td>
                                </tr>
                                <tr>
                                    <td>/404.html</td>
                                    <td>23</td>
                                    <td>34.3%</td>
                                    <td>$23.52</td>
                                </tr>
                                <tr>
                                    <td>/services.html</td>
                                    <td>421</td>
                                    <td>60.3%</td>
                                    <td>$724.32</td>
                                </tr>
                                <tr>
                                    <td>/blog/post.html</td>
                                    <td>1233</td>
                                    <td>93.2%</td>
                                    <td>$126.34</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div className="col-lg-6">
                    <h2>Bootstrap Docs</h2>
                    <p>For complete documentation, please visit <a target="_blank" href="http://getbootstrap.com/css/#tables">Bootstrap's Tables Documentation</a>.</p>
                </div>
            </div>
        </div>);
    }

}

ReactDOM.render(<TablePage />, document.getElementById('root'));