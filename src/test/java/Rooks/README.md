# Rooks
### Goal: java experience, String manipulation, logical thinking

#### expected time: under 5min

---

Knowledge/Intuition about the Java String class is necessary.

### Task:
Write a function that returns true if two rooks can attack each other, and false otherwise

#### Examples:

    canCapture(["A8", "E8"]) ➞ true
    
    canCapture(["A1", "B2"]) ➞ false
    
    canCapture(["H4", "H3"]) ➞ true
    
    canCapture(["F5", "C8"]) ➞ false


<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
            <style>
                .chess-board { border-spacing: 0; border-collapse: collapse; }
                .chess-board th { padding: .5em; }
                .chess-board th + th { border-bottom: 1px solid #000; }
                .chess-board th:first-child,
                .chess-board td:last-child { border-right: 1px solid #000; }
                .chess-board tr:last-child td { border-bottom: 1px solid; }
                .chess-board th:empty { border: none; }
                .chess-board td { width: 1.5em; height: 1.5em; text-align: center; font-size: 32px; line-height: 0;}
                .chess-board .light { background: #eee; }
                .chess-board .dark { background: #aaa; }
                td {
                    color:black;
                }
            </style>
    </head>
    <body>
        <table class="chess-board">
            <tbody>
                <tr>
                    <th></th>
                    <th>A</th>
                    <th>B</th>
                    <th>C</th>
                    <th>D</th>
                    <th>E</th>
                    <th>F</th>
                    <th>G</th>
                    <th>H</th>
                </tr>
                <tr>
                    <th>8</th>
                    <td class="light">♜</td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                </tr>
                <tr>
                    <th>7</th>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                </tr>
                <tr>
                    <th>6</th>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                </tr>
                <tr>
                    <th>5</th>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                </tr>
                <tr>
                    <th>4</th>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                </tr>
                <tr>
                    <th>3</th>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                </tr>
                <tr>
                    <th>2</th>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                </tr>
                <tr>
                    <th>1</th>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                    <td class="dark">♖</td>
                    <td class="light"></td>
                    <td class="dark"></td>
                    <td class="light"></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>