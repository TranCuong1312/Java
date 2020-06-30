import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'north'
})
export class NorthPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
