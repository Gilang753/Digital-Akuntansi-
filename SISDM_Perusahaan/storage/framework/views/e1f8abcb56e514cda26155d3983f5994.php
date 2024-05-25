

<?php $__env->startSection('content'); ?>
<div class="container">
    <h1>Data Tunjangan</h1>
    <a href="<?php echo e(route('tunjangan.create')); ?>" class="btn btn-primary">Tambah Tunjangan</a>
    <table class="table">
        <thead>
            <tr>
                <th>ID Tunjangan</th>
                <th>Nama Tunjangan</th>
                <th>Besaran Tunjangan</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <?php $__currentLoopData = $tunjangans; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $tunjangan): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
            <tr>
                <td><?php echo e($tunjangan->id_tunjangan); ?></td>
                <td><?php echo e($tunjangan->nama_tunjangan); ?></td>
                <td><?php echo e($tunjangan->besaran_tunjangan); ?></td>
                <td>
                    <a href="<?php echo e(route('tunjangan.show', $tunjangan->id_tunjangan)); ?>" class="btn btn-info">View</a>
                    <a href="<?php echo e(route('tunjangan.edit', $tunjangan->id_tunjangan)); ?>" class="btn btn-warning">Edit</a>
                    <form action="<?php echo e(route('tunjangan.destroy', $tunjangan->id_tunjangan)); ?>" method="POST" style="display:inline;">
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

<?php echo $__env->make('dashboard', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\xampp\htdocs\SISDM_Perusahaan\resources\views/tunjangan/index.blade.php ENDPATH**/ ?>