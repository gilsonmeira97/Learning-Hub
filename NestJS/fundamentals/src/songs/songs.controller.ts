import { Body, Controller, Delete, Get, Post, Put } from '@nestjs/common';
import { SongsService } from './songs.service';
import { CreateSongDTO } from './dto/create-song-dto';

@Controller('songs')
export class SongsController {

    constructor(private songsService: SongsService) {}

    @Get()
    findAll() {
        return this.songsService.findAll();
    }

    @Get(':id')
    findById() {
        return "Finded by id";
    }

    @Post()
    create(@Body() createSongDTO: CreateSongDTO) {
        return this.songsService.create(createSongDTO);
    }

    @Put(':id')
    update() {
        return "updated by id";
    }

    @Delete(':id')
    delete() {
        return "Deleted by id!";
    }
}
