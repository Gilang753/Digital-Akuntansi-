

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Gaji</h1>
    <a href="<?php echo e(route('gaji.create')); ?>" class="btn btn-primary">Tambah Gaji</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID Gaji</th>
                <th>ID Pegawai</th>
                <th>ID Tunjangan</th>
                <th>Tanggal Gaji</th>
                <th>Gaji Pokok</th>
                <th>Gaji Lembur</th>
                <th>Gaji Total</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tb_gaji; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $gaji): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($gaji->id_gaji); ?></td>
                <td><?php echo e($gaji->id_pegawai); ?></td>
                <td><?php echo e($gaji->id_tunjangan); ?></td>
                <td><?php echo e($gaji->tanggal_gaji); ?></td>
                <td><?php echo e($gaji->gaji_pokok); ?></td>
                <td><?php echo e($gaji->gaji_lembur); ?></td>
                <td><?php echo e($gaji->gaji_total); ?></td>
                <td>
                    <a href="<?php echo e(route('gaji.show', $gaji->id_gaji)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('gaji.edit', $gaji->id_gaji)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('gaji.destroy', $gaji->id_gaji)); ?>" method="POST" style="display:inline;">
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

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/gaji/index.blade.php ENDPATH**/ ?>