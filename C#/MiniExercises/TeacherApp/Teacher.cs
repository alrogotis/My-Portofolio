using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TeacherApp
{
    internal sealed class Teacher
    {
        private readonly int id;
        private readonly string? firstname;
        private readonly string? lastname;
        public int Id { get; }
        public string? Firstname { get; private set; }

        public string? Lastname { get; private set; }

        public override bool Equals(object? obj)
        {
            if ((obj == null) || (GetType() != obj.GetType()))
            {

            }

            var other = (Teacher)obj;

            return ((Id == other.Id) && (Firstname.Equals(other.Firstname)) && (Lastname.Equals(other.Lastname)));
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(Id, Firstname, Lastname);
        }

        public override string? ToString() => $"{Id}, {Firstname}, {Lastname}";
        

    }
}
