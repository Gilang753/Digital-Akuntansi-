

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Pendidikan</h1>
    <a href="<?php echo e(route('pendidikan.create')); ?>" class="btn btn-primary">Tambah Pendidikan</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID Pendidikan</th>
                <th>ID Pegawai</th>
                <th>ID Pengembangan</th>
                <th>Jenjang Pendidikan</th>
                <th>Institusi Pendidikan</th>
                <th>Jurusan</th>
                <th>Tanggal Kelulusan</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tb_pendidikan; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $pendidikan): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($pendidikan->id_pendidikan); ?></td>
                <td><?php echo e($pendidikan->id_pegawai); ?></td>
                <td><?php echo e($pendidikan->id_pengembangan); ?></td>
                <td><?php echo e($pendidikan->jenjangPendidikan); ?></td>
                <td><?php echo e($pendidikan->institusiPendidikan); ?></td>
                <td><?php echo e($pendidikan->jurusan); ?></td>
                <td><?php echo e($pendidikan->tanggal_kelulusan); ?></td>
                <td>
                    <a href="<?php echo e(route('pendidikan.show', $pendidikan->id_pendidikan)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('pendidikan.edit', $pendidikan->id_pendidikan)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('pendidikan.destroy', $pendidikan->id_pendidikan)); ?>" method="POST" style="display:inline;">
                        <?php echo csrf_field(); ?>
                        <?php echo method_field('DELETE'); ?>
                        <button type="submit" class="btn btn-danger">Delete</button>
                    </form>
                </td>
            </tr>
            <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
        </tbody>
    </table>
</div>
<?php $__env->stopSection(); ?>

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pendidikan/index.blade.php ENDPATH**/ ?>