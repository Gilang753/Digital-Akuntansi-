

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Absensi</h1>
    <a href="<?php echo e(route('absensi.create')); ?>" class="btn btn-primary">Tambah Absensi</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>ID Pegawai</th>
                <th>Tanggal Absensi</th>
                <th>Jam Masuk</th>
                <th>Jam Pulang</th>
                <th>Keterangan</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tb_absensi; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $absensi): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($absensi->id_absensi); ?></td>
                <td><?php echo e($absensi->id_pegawai); ?></td>
                <td><?php echo e($absensi->tanggal_absensi); ?></td>
                <td><?php echo e($absensi->jam_masuk); ?></td>
                <td><?php echo e($absensi->jam_pulang); ?></td>
                <td><?php echo e($absensi->keterangan); ?></td>
                <td>
                    <a href="<?php echo e(route('absensi.show', $absensi->id_absensi)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('absensi.edit', $absensi->id_absensi)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('absensi.destroy', $absensi->id_absensi)); ?>" method="POST" style="display:inline;">
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

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/absensi/index.blade.php ENDPATH**/ ?>