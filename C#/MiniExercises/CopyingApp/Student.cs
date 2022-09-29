using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CopyingApp
{
    internal class Student
    {
        public int Id { get; set; }
        public string Firstname { get; set; }

        public string Lastname { get; set; }

        public Address Address { get; set; }

        public Student() { }

        public Student GetCopyReference()
        {
            return this;
        }

        public Student GetShallowCopy() 
        { 
            return (Student)MemberwiseClone();
        }

        public Student DeepCopy()
        {
            Student student = (Student)MemberwiseClone();
            student.Address = new() { Street = Address.Street, Number = Address.Number, ZipCode = Address.ZipCode};
            return student;
        }

        public Student(Student stu)
        {
            this.Id = stu.Id;
            Firstname = stu.Firstname;
            Lastname = stu.Lastname;
            Address = new() { Street = stu.Address.Street, Number = stu.Address.Number, ZipCode = stu.Address.ZipCode };
        }
    }
}
