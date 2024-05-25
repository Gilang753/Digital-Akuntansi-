

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Pengembangan Diri</h1>
    <a href="<?php echo e(route('pengembangandiri.create')); ?>" class="btn btn-primary">Tambah Pengembangan Diri</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID Pengembangan</th>
                <th>ID Pegawai</th>
                <th>Jenis Pelatihan</th>
                <th>Tanggal Pelaksanaan</th>
                <th>Sertifikat</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tb_pengembangandiri; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $pengembangan): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($pengembangan->id_pengembangan); ?></td>
                <td><?php echo e($pengembangan->id_pegawai); ?></td>
                <td><?php echo e($pengembangan->jenis_pelatihan); ?></td>
                <td><?php echo e($pengembangan->tanggal_pelaksanaan); ?></td>
                <td><?php echo e($pengembangan->sertifikat); ?></td>
                <td>
                    <a href="<?php echo e(route('pengembangandiri.show', $pengembangan->id_pengembangan)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('pengembangandiri.edit', $pengembangan->id_pengembangan)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('pengembangandiri.destroy', $pengembangan->id_pengembangan)); ?>" method="POST" style="display:inline;">
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

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/pengembangandiri/index.blade.php ENDPATH**/ ?>